package nl.han.se.bewd.mockworkshop.toets;

import nl.han.se.bewd.mockworkshop.student.Student;

public class FakeToets extends Toets {

    int fakeReturnValue = 0;

    public void setReturnValueForGetToetsCijferVoorStudent(int fakeReturnValue) {
        this.fakeReturnValue = fakeReturnValue;
    }

    @Override
    public int getToetsCijferVoorStudent(Student s) {
        return fakeReturnValue;
    }
}
