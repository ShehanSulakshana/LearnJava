# 📚 LearnJava - Java Learning Journey

A comprehensive collection of Java programs and projects designed for beginners and intermediate learners. This repository contains practical examples covering fundamental to intermediate concepts.

---

## 🎯 What's Inside?

This repository is organized into two main sections:

### **Root Level Programs** (Basic Concepts)
Quick programs that demonstrate individual Java concepts:

| Program | What You'll Learn |
|---------|-------------------|
| **BasicNotes.java** | Java syntax basics and core concepts |
| **CubeCalculator.java** | Mathematical calculations and input handling |
| **DecInt.java** | Data type conversions (decimal to integer) |
| **ElectricityBillCalc.java** | Real-world calculations and conditionals |
| **FileHandling.java** | Reading and writing files in Java |
| **MarksGrade.java** | Using conditionals to assign grades |
| **MultiTable.java** | Loops and multiplication tables |
| **NumberPattern.java** | Loops and pattern printing |
| **SimpleBankApplication.java** | Object-oriented banking system |
| **StarPatterns.java** | Complex nested loops and pattern creation |
| **StringOperations.java** | String manipulation and built-in methods |

### **Advanced Topics** (Organized Folders)

#### 📁 **EmployeeArrayHandler/**
Handling collections of objects:
- `Employee.java` - Employee class with properties
- `Company.java` - Managing multiple employees
- Learn about: Arrays, objects, data management

#### 📁 **Inheritance/**
Understanding object-oriented hierarchy:
- `Animal.java` - Parent class with common properties
- `Dog.java` - Child class inheriting from Animal
- `oopInheritance.java` - Practical inheritance examples
- Learn about: Class hierarchy, method overriding, code reusability

#### 📁 **Polymorphism/**
Multiple forms of objects and methods:
- `engine.java` - Base engine class
- `car.java` - Car implementation
- `oopPolymorphism.java` - Polymorphism examples
- Learn about: Method overriding, interface flexibility, dynamic binding

---

## 🚀 How to Run

### **Using IntelliJ IDEA** (Recommended)
1. Open the project in IntelliJ IDEA
2. Right-click any `.java` file
3. Select "Run 'FileName.main()'"
4. View output in the console

### **Using Command Line**
```bash
# Navigate to the project directory
cd LearnJava

# Compile a file
javac src/MarksGrade.java

# Run the compiled file
java -cp src MarksGrade
```

### **Using VS Code**
1. Install "Extension Pack for Java" by Microsoft
2. Open the file you want to run
3. Click the "Run" button (triangle icon) at the top right
4. Output appears in the terminal

---

## 📖 Learning Path (Recommended Order)

**Start Here:**
1. BasicNotes.java - Understand the fundamentals
2. CubeCalculator.java - Learn about variables and operations
3. MultiTable.java - Master loops
4. NumberPattern.java - Apply loops creatively

**Then Move To:**
5. StringOperations.java - Work with text
6. FileHandling.java - Read/write data
7. MarksGrade.java - Use conditionals effectively

**Object-Oriented Programming:**
8. SimpleBankApplication.java - Your first OOP project
9. Inheritance/ folder - Learn class relationships
10. EmployeeArrayHandler/ folder - Manage multiple objects
11. Polymorphism/ folder - Advanced OOP concepts

---

## 🛠️ Project Structure

```
LearnJava/
├── src/
│   ├── BasicNotes.java
│   ├── CubeCalculator.java
│   ├── DecInt.java
│   ├── ElectricityBillCalc.java
│   ├── FileHandling.java
│   ├── MarksGrade.java
│   ├── MultiTable.java
│   ├── NumberPattern.java
│   ├── SimpleBankApplication.java
│   ├── StarPatterns.java
│   ├── StringOperations.java
│   ├── Tests.java
│   ├── EmployeeArrayHandler/
│   │   ├── Employee.java
│   │   └── Company.java
│   ├── Inheritance/
│   │   ├── Animal.java
│   │   ├── Dog.java
│   │   └── oopInheritance.java
│   └── Polymorphism/
│       ├── engine.java
│       ├── car.java
│       └── oopPolymorphism.java
├── LearnJava.iml          (IntelliJ project file)
└── README.md              (This file)
```

---

## 💡 Key Concepts Covered

### **Fundamentals**
- ✅ Variables and data types
- ✅ Input/Output operations
- ✅ Operators and expressions
- ✅ Conditional statements (if/else)

### **Control Flow**
- ✅ Loops (for, while, do-while)
- ✅ Pattern printing
- ✅ Break and continue statements

### **Strings & I/O**
- ✅ String methods and manipulation
- ✅ File reading and writing
- ✅ Exception handling basics

### **Object-Oriented Programming**
- ✅ Classes and objects
- ✅ Inheritance (parent-child relationships)
- ✅ Polymorphism (method overriding)
- ✅ Arrays of objects
- ✅ Real-world application design

---

## 🎓 Prerequisites

Before starting, make sure you have:
- **Java Development Kit (JDK)** 8 or higher installed
- **IDE**: IntelliJ IDEA, VS Code, or any Java-supported editor
- Basic understanding of programming concepts (variables, loops, conditionals)

### **Check Your Java Installation**
```bash
java -version
javac -version
```

---

## 📝 Tips for Learning

1. **Read the Code First** - Understand what each line does
2. **Run & Modify** - Change values and see what happens
3. **Experiment** - Try breaking and fixing the code
4. **Comment Your Code** - Add notes to help future you understand
5. **Practice** - Write similar programs from scratch

---

## 🔍 Program Descriptions

### **SimpleBankApplication.java**
A complete banking system demonstrating OOP:
- Create accounts
- Deposit and withdraw money
- Check balance
- Apply interest

### **EmployeeArrayHandler/ (Folder)**
Managing multiple employee records:
- Store employee data
- Display all employees
- Calculate total salary

### **Inheritance/ (Folder)**
Real-world inheritance example:
- Base animal class
- Dog class that inherits from Animal
- See how code is reused and extended

### **Polymorphism/ (Folder)**
Understanding method overriding:
- Different engine types
- Cars with different engines
- Same interface, different behavior

---

## 🐛 Troubleshooting

**Issue**: "javac: command not found"
- **Solution**: Install JDK and add it to your system PATH

**Issue**: "Exception in thread 'main'"
- **Solution**: Check your file location and class names match

**Issue**: File not reading properly
- **Solution**: Verify file path is correct and file exists in the directory

---

## 📌 Important Notes

- Each program is **independent** - you can run them separately
- Some programs may ask for **user input** - read the console prompts carefully
- The **Inheritance** and **Polymorphism** folders contain multiple classes - run the main class file
- Always check the **file paths** when running file handling programs

---

## 🤝 Contributing

Found a bug or want to improve a program? Feel free to:
1. Fix it in your local copy
2. Add comments to explain your changes
3. Test before updating

---

## 📜 License

This repository is for educational purposes. Feel free to use, modify, and learn from these programs.

---

## 🎯 Next Steps

Once you've completed these programs:
- Try building your own projects
- Explore **Collections** (ArrayList, HashMap)
- Learn **Exception Handling** in detail
- Study **Database connectivity** with JDBC
- Explore **Spring Framework** for web development

---

**Happy Learning! 🚀**

*Last Updated: May 2026*
