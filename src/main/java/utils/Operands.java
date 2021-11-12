package utils;

import java.util.Objects;

    /** 
     * класс предназначенный для более удобного обращения с парой чисел
     */
public class Operands 
{
    private final float first;
    private final float second;

    public Operands(float first, float second) 
    {
        this.first = first;
        this.second = second;
    }

    
    /** 
     * @return float простое получение первого числа 
     */
    public float getFirst() 
    {
        return first;
    }

    
    /** 
     * @return float простое получение второго числа 
     */
    public float getSecond() 
    {
        return second;
    }

    
    /** 
     * @param o объект сравнения
     * @return boolean резултат сравнения this и объекта о
     */
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operands operands = (Operands) o;
        return Float.compare(operands.first, first) == 0 && Float.compare(operands.second, second) == 0;
    }

    

    @Override
    public int hashCode() 
    {
        return Objects.hash(first, second);
    }

    

    @Override
    public String toString() 
    {
        return "utils.Operands{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
