# 📚 LearnJava - Java Learning Journey (Restored)

This repository contains beginner-to-intermediate Java examples. The project was recently restored from compiled class files; the recovered `src/` tree is listed below. Comments and formatting may differ from the original sources.

---

## 📁 What's Inside

Core programs are in the `src/` directory. Major files and folders:

- Root `src/` examples (basic concepts):
	- `BasicNotes.java`
	- `CubeCalculator.java`
	- `DecInt.java`
	- `ElectricityBillCalc.java`
	- `FileHandling.java`
	- `MarksGrade.java`
	- `MultiTable.java`
	- `NumberPattern.java`
	- `SimpleBankApplication.java`
	- `StarPatterns.java`
	- `StringOperations.java`
	- `Tests.java`

- Advanced topics (folders):
	- `EmployeeArrayHandler/`
		- `Employee.java`
		- `Company.java`
	- `Inheritance/`
		- `Animal.java`
		- `Dog.java`
		- `oopInheritance.java`
	- `Polymorphism/`
		- `engine.java`
		- `car.java`
		- `oopPolymorphism.java`

---

## 🚀 How to Run

Using the command line (from project root):

```bash
# Compile all sources into an output folder
javac -d out src/**/*.java src/*.java

# Run a class (example)
java -cp out SimpleBankApplication
```

In IntelliJ or VS Code: open the project, build, and run the desired `main` class.

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
├── .gitignore
└── README.md
```

---

## ✅ Recovery Notes

- Sources were reconstructed from the `out/production/LearnJava` compiled classes using `javap` and manual conversion to Java source files.
- This is a best-effort recovery; comments, exact formatting, and some local variable names are not preserved.
- Accidental build artifacts were removed and `.gitignore` was added to avoid committing `out/` folders.

---

## 📚 Next Steps (suggested)

1. Review the recovered sources and run unit/manual tests of key programs.
2. Add or update comments and Javadoc where helpful.
3. Add a more specific `.gitignore` if you use an IDE (IntelliJ, VS Code) to exclude workspace files.

If you want, I can now:
- run a full compilation and report any remaining warnings/errors, or
- update README sections with example commands for specific programs.

---

## 📜 License

This repository is for educational purposes. Feel free to use, modify, and learn from these programs.

---
---

**Happy Learning! 🚀**

*Last Updated: May 2026*
