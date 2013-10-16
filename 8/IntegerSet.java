import java.util.Arrays;
public class IntegerSet
{
    private boolean[] setElements;
    public IntegerSet()
    {
        setElements = new boolean[100];
    }
    public IntegerSet(int... number)
    {
        setElements = new boolean[100];
        for (int d : number)
            setElements[d] = true;
    }
    public boolean testPresence(int n)
    {
        return setElements[n];
    }
    public static IntegerSet union(IntegerSet one, IntegerSet two)
    {
        IntegerSet unionSet = new IntegerSet();
        for (int counter = 0; counter < 100; counter++)
        {
            if (one.testPresence(counter) == true || two.testPresence(counter) == true)
                unionSet.insertElement(counter);
            else
                unionSet.deleteElement(counter);
        }
        return unionSet;
    }
    public static IntegerSet intersection(IntegerSet one, IntegerSet two)
    {
        IntegerSet intersectionSet = new IntegerSet();
        for (int counter = 0; counter < 100; counter++)
        {
            if (one.testPresence(counter) == false || two.testPresence(counter) == false)
                intersectionSet.deleteElement(counter);
            else
                intersectionSet.insertElement(counter);
        }
        return intersectionSet;
    }
    public void insertElement(int k)
    {
        setElements[k] = true;
    }
    public void deleteElement(int k)
    {
        setElements[k] = false;
    }
    public String toString()
    {
        String[] stringStore = new String[100];
        for (int counter = 0; counter < 100; counter++)
        {
            if (setElements[counter] == true)
                stringStore[counter] = "" + counter;
            else
                stringStore[counter] = "---";
        }
        return Arrays.toString(stringStore);
    }
    public static boolean isEqual(IntegerSet one, IntegerSet two)
    {
        int check = 0;
        for (int counter = 0; counter < 100; counter++)
        {
            if (one.testPresence(counter) == two.testPresence(counter))
                check++;
        }
        if (check == 100)
            return true;
        else
            return false;
    }
}