package database;

public interface DataBase {
    <T>T query(String queryType);
}
