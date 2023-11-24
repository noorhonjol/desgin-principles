# desgin-principle

- Singleton Design Pattern in FakeDatabase: Using the Singleton pattern in the FakeDatabase to ensure there is only one instance of the object to improve performance.

- Database Interface to Decouple Dependencies: Creating a database interface to decouple dependencies from concrete implementations, enabling flexibility in changing databases without affecting the rest of the code.
  
- Abstract User Class with Inheritance: Using an abstract User class and inheriting from it Director, Manager, and Staff classes .

- Using a List of Abstract User Class in Manager and Director: Utilizing a list of abstract User classes in Manager and Director to manage different user types in this list based on requierment.
  
- IRoport Interface for Decoupling Required Concrete Classes: Introducing an IRoport interface to decouple dependencies on specific report implementations, applying flexibility in utilizing different report types and to apply the open closed principle.

- ReportManager Class for Single Responsibility and Polymorphism: Implementing a ReportManager class that contains a set from type of interface IReport to take advantage of polymorphism and apply single responsibility princible by sperate whole report process from User.


![alt text](https://lh3.googleusercontent.com/u/0/drive-viewer/AK7aPaBHGawE10mOF1ocNVp0HmY6Qxt5oa1tRWVpg6Ah8o46Vb1U0UZ4Q5xxZykJnKiTahDEwQgd_QzrOMJ_oVP9snTymk7cog=w2560-h1283)
