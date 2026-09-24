# Java Journey ☕

A practice repository organized by **Java topic** and **descriptive program names**, so you can find yesterday's exercise without remembering whether it was called `q7.java`, `Main2.java`, or `Revise5.java`.

## 🔎 Find your program

**[Open the full searchable file index →](FILE_INDEX.md)** and press **Ctrl+F** (for example, search `Palindrome`, `Recursion`, or `Railway`). Or open the topic folders below.

| Folder | Contains |
|---|---|
| [00-Notes](00-Notes/) | Short Java notes |
| [01-Basics](01-Basics/) | Input/output, `if-else`, operators |
| [02-Loops](02-Loops/) | Loops, counting, tables |
| [03-Number-Problems](03-Number-Problems/) | Sum of digits, reverse number, digit printing |
| [04-Arrays](04-Arrays/) | Array sum, largest/smallest, matrices |
| [05-Strings](05-Strings/) | String methods |
| [06-Patterns](06-Patterns/) | Star and number patterns |
| [07-Methods](07-Methods/) | Methods and recursion |
| [09-Mini-Projects](09-Mini-Projects/) | Mini ATM and guessing game |
| [10-Exam-Practice](10-Exam-Practice/) | Sample paper, your own attempts, extra practice |
| [11-Drafts](11-Drafts/) | Incomplete / empty learning snippets (not ready to run) |

### Examples

- [Sum of digits](03-Number-Problems/SumOfDigits.java)
- [Reverse a number](03-Number-Problems/ReverseNumber.java)
- [Palindrome number (exam practice)](10-Exam-Practice/Extra-Practice/PalindromeNumberExamPractice.java)
- [Factorial](10-Exam-Practice/Extra-Practice/FactorialExamPractice.java)
- [Railway ticket fare calculator](10-Exam-Practice/Sample-Paper/RailwayTicketFareCalculator.java)
- [Student result inheritance](10-Exam-Practice/Sample-Paper/StudentResultInheritance.java)

## ▶️ Run a program

For an independent example with a matching public class and file name, use a terminal inside that example's folder:

```powershell
javac ReverseNumber.java
java ReverseNumber
```

Some exam-paper examples contain **multiple package-private classes** and the file name describes the exercise rather than its `main` class. For example, from `10-Exam-Practice/Sample-Paper`:

```powershell
javac StudentResultInheritance.java
java Result
```

Run each standalone exercise separately. These teaching examples intentionally do not use Java packages; compiling the entire repository in one command can cause duplicate class-name conflicts between independent exam solutions.

## ✍️ Add a new exercise

Save it in the relevant topic folder with a name such as `CountDigits.java`, not `Main7.java`. If the class is `public`, **its name must match the file name**. Run/check your exercise before committing, and use a descriptive commit message.

## Existing exercise notes

This change **organizes and renames** the original exercises without changing their problem-solving logic. It does not certify all old programs as correct. For example, `LargestOfThreeWithInput.java` and `SecondLargestArrayElement.java` contain existing comparison-logic errors; some files in `11-Drafts` are incomplete; and `RecursionCountdown.java` uses a very deep example call. Fix and test these separately as you learn.
