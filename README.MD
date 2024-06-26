
![](algorithm-computer-scientist.jpg)
# Алгоритмы на LeetCode

## Введение

Этот репозиторий содержит набор методов и тестов для решения различных алгоритмических задач на LeetCode. Здесь вы найдете решения для задач, связанных с сортировкой, поиском, обработкой строк и других алгоритмических задач.

## Установка

1. Скачайте репозиторий.
2. Убедитесь, что у вас установлена Java Development Kit (JDK) и среда разработки, поддерживающая Java (например, IntelliJ IDEA или Eclipse).
3. Откройте проект в вашей среде разработки.
4. Запустите тесты, чтобы убедиться, что все работает корректно.

## Алгоритмы и методы

В этом репозитории представлены решения для следующих алгоритмических задач:

1. **Сортировка**: методы для сортировки массивов и структур данных.
2. **Поиск**: методы для поиска элементов в массивах и структурах данных.
3. **Обработка строк**: методы для работы со строками, включая поиск подстрок, конкатенацию и другие операции.
4. **Другие алгоритмические задачи**: решения для задач, связанных с обработкой графов, деревьями и другими структурами данных.  
### Список задач:  
``Add Two Numbers, Balanced Binary Tree, Longest Common Prefix, Longest Palindromic Substring, Longest Substring Without Repeating Characters, 
Median of Two Sorted Arrays, Merge Two Sorted Lists, Minimum Depth of Binary Tree, Palindrome Number, Remove Duplicates from Sorted List, 
Reverse Integer, Roman to Integer, Search Insert Position, Single Number, String to Integer (atoi), Two Sum, Valid Parentheses,
Zigzag Conversion, Regular Expression Matching, Container With Most Water, Integer to Roman, 3Sum, 3Sum Closest, Letter Combinations of a Phone Number, Valid Palindrome
``
## Тесты

В этом репозитории также представлены тесты для проверки корректности работы алгоритмов. Тесты написаны на Java с использованием библиотеки JUnit.

### Пример теста

Вот пример теста для проверки метода `longestPalindrome`:  
```java
    @Test
    void longestPalindrome() {
        String result = LongestPalindromicSubstring.longestPalindrome("babad");
        Assertions.assertTrue(result.equals("bab") || result.equals("aba"), "Expected 'bab' or 'aba' but got " + result);
        Assertions.assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
        Assertions.assertEquals("a", LongestPalindromicSubstring.longestPalindrome("a"));
    }
```


В этом тесте мы проверяем, что метод находит самую длинную палиндромную подстроку в строке

### Заключение

Этот репозиторий предоставляет полный набор методов и тестов для решения различных алгоритмических задач на LeetCode. Мы надеемся, что он будет полезен для всех, кто изучает алгоритмы и структуры данных.

Спасибо за внимание!