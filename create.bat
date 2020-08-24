@echo off
SetLocal EnableDelayedExpansion
set dirname=P%1%
mkdir src\in_progress\%dirname%
echo package in_progress.%dirname%;  >> src\in_progress\%dirname%\Main.java
FOR /F "delims=" %%G IN (template) DO (
    ECHO %%G
) >> src\in_progress\%dirname%\Main.java
code src\in_progress\%dirname%\Main.java
EndLocal