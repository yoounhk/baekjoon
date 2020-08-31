@echo off
SetLocal EnableDelayedExpansion
set ClassName=%1%
	echo // https://github.com/yoounhk/baekjoon > src\%ClassName%.java
    echo package src; >> src\%ClassName%.java
    echo import java.util.Scanner; >> src\%ClassName%.java
    echo public class %ClassName% { >> src\%ClassName%.java
    echo private static Scanner scanner = new Scanner(System.in); >> src\%ClassName%.java
    echo public static void main(String args[]) { >> src\%ClassName%.java
    echo scanner.close(); >> src\%ClassName%.java
    echo   } >> src\%ClassName%.java
    echo } >> src\%ClassName%.java
code src\%ClassName%.java
EndLocal