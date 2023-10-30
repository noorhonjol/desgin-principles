package database;
import models.Director;
import models.Manager;
import models.Staff;
import models.User;
import java.util.ArrayList;
import java.util.List;

public class FakeDB implements DataBase {
    private final ArrayList<User>userList;
    private static FakeDB dataBase = null;

    private FakeDB() {
        userList=new ArrayList<>();
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
        addSomeUsers();
        ArrayList<User> filteredList = new ArrayList<>();
        if(mangerQueryFilter(queryType)){
            for (User user: userList) {
                String userType=user.getUserType();
                if(isManger(userType)||isStaff(userType)){
                    filteredList.add(user);
                }
            }
            return (T)filteredList;

        }else if(staffsQueryFilter(queryType)){
            for (User user: userList) {
                String userType=user.getUserType();
                if(isStaff(userType)){
                    filteredList.add(user);
                }
            }
            return (T)filteredList;
        }
        return null;
    }
    private boolean mangerQueryFilter(String queryType){
        return "staffs and mangers".equals(queryType);
    }
    private boolean staffsQueryFilter(String queryType){

        return "staffs".equals(queryType);
    }
    private boolean isManger(String userType){
        return "manger".equals(userType);
    }
    private boolean isStaff(String userType){
        return "staff".equals(userType);
    }
    private void addSomeUsers(){
        userList.add(new Director("D001", "David", 40, 35.0, 200));
        userList.add(new Director("D002", "kevin", 40, 35.0, 200));
        userList.add(new Manager("1", "John", 30, 20.0, 160));
        userList.add(new Manager("2", "Alice", 28, 18.0, 140));
        userList.add(new Manager("3", "Bob", 35, 22.0, 150));
        userList.add(new Staff("4", "Charlie", 25, 25.0, 180));
        userList.add(new Staff("5", "Emma", 29, 23.0, 170));
        userList.add(new Staff("6", "larry", 50, 15.0, 200));
    }
}