package ru.mirea.task12.sortVstavkoi;

public class Student
{
    public int idNumber[];

    public Student() {
        idNumber = new int[5];
        idNumber[0] = 40;
        idNumber[1] = 1;
        idNumber[2] = 31;
        idNumber[3] = 14;
        idNumber[4] = 30;
    }

    public void insertionSort() {
        for (int left = 1; left < idNumber.length; left++) {
            int value = idNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < idNumber[i]) {
                    idNumber[i + 1] = idNumber[i];
                } else {
                    break;
                }
            }
            idNumber[i + 1] = value;
        }
    }

    public void getArr()
    {
        for (int aIdNumber : idNumber) {
            System.out.println(aIdNumber);
        }
    }

    public static void main(String[] args)
    {
        Student student = new Student();
        student.insertionSort();
        student.getArr();
    }
}
