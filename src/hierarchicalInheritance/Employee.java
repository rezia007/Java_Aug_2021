package hierarchicalInheritance;

class Employee {
    float salary = 40000;
}
class PermanentEmp extends Employee{
    double hike = 0.5;
}
class TemporaryEmp extends Employee{
    double hike = 0.35;
}

