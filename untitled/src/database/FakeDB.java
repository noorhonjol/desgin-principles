package database;
import Factory.UserFactory;
import models.User;
import java.util.ArrayList;
import java.util.List;

public class FakeDB implements DataBase {
    private final ArrayList<User>userList;
    private static FakeDB dataBase = null;
    private FakeDB() {
        userList=new ArrayList<>();
        addSomeUsers();
    }
    public static FakeDB getInstance() {

        if (dataBase == null) {
            synchronized (FakeDB.class) {
                if (dataBase == null) {
                    dataBase = new FakeDB();
                }
            }
        }
        return dataBase;
    }
    @Override
    public <T >T query(String queryType) {
        ArrayList<User> filteredList = new ArrayList<>();
        if(getMangersQueryFilter(queryType)){
            for (User user: userList) {
                String userType=user.getUserType();
                if(isManger(userType)){
                    filteredList.add(user);
                }
            }
            return (T)filteredList;
        }else if(getDirectorsQueryFilter(queryType)){
            for (User user: userList) {
                String userType=user.getUserType();
                if(isDirector(userType)){
                    filteredList.add(user);
                }
            }
            return (T)filteredList;
        }
        return null;
    }
    private boolean getMangersQueryFilter(String query){
        return "get mangers".equals(query);
    }
    private boolean getDirectorsQueryFilter(String query){
        return "get directors".equals(query);
    }

    private boolean isManger(String userType){
        return "manger".equals(userType);
    }
    private boolean isDirector(String userType){
        return "director".equals(userType);
    }
    private void addSomeUsers(){
        User staff1=UserFactory.createStaff("4", "Charlie", 25, 25.0, 180);
        User staff2=UserFactory.createStaff("5", "Emma", 29, 23.0, 170);
        User staff3=UserFactory.createStaff("5", "Emma", 29, 23.0, 170);
        User staff4=UserFactory.createStaff("6", "larry", 50, 15.0, 200);
        User manger1=UserFactory.createManager("2", "Alice", 28, 18.0, 140,List.of(staff1,staff2));
        User manger2=UserFactory.createManager("3", "Bob", 35, 22.0, 150,List.of(staff3,staff4));
        User director1=UserFactory.createDirector("D001", "David", 40, 35.0, 200,List.of(manger1,staff2,staff1));
        User director2=UserFactory.createDirector("D002", "kevin", 45, 35.0, 200,List.of(manger2,staff4));

        userList.addAll(List.of(staff1,staff2,staff3,staff4,director1,director2,manger1,manger2));


    }
}