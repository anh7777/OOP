package hus.oop.mystudentmanager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private MyList studentList;

    private StudentManager() {
        /* TODO */
        this.studentList = new MyLinkedList();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public MyList getStudentList() {
        /* TODO */
        return studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        this.studentList.insertAtEnd(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        this.studentList.insertAtPosition(student, index);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        this.studentList.remove(index);
    }


    /**
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        /* TODO */
        remove(student);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return (Student) studentList.get(index);
    }


    /**
     * Lọc ra những sinh viên có điểm trung bình trên 15 điểm.
     * @return
     */
    public MyList filterStudentsByAverageGrade() {
        /* TODO */
        MyList result = new MyLinkedList();
        MyIterator iterator = this.studentList.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getAverageGrade() > 5) {
                result.insertAtPosition(student, i);
                i++;
            }
        }
        return result;
    }

    /**
     * Lọc ra những sinh viên có điểm toán trên 5 điểm.
     * @return
     */
    public MyList filterStudentsByMathGrade() {
        /* TODO */
        MyList result = new MyLinkedList();
        MyIterator iterator = this.studentList.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getMathsGrade() > 5) {
                result.insertAtPosition(student, i);
            }
        }
        return result;
    }
}
