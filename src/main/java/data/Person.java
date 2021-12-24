package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Person 
{
    private int id;
    private String name;
    private String sex;
    private String birthDate;
    private String subdiv;
    private int salary;

    public Person() 
    {
        this.id = 0;
        this.name = "";
        this.sex = "";
        this.birthDate = "";
        this.subdiv = "";
        this.salary = 0;
    }

    public Person(int id, String name, String sex, String birthDate, String subdiv, int salary) 
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.subdiv = subdiv;
        this.salary = salary;
    }

        
    /** 
     * @param line lines that may has different form
     * @return PersonClass allready person class that contains all data about one person
     */
    public Person(String[] line) 
    {
        var record = new ArrayList<>(List.of(line[0].split(";")));

        if (line.length > 1) 
        {
            fixInvalidRecord(line, record);
        }

        this.id = Integer.parseInt(record.get(0));
        this.name = record.get(1);
        this.sex = record.get(2);
        this.birthDate = record.get(3);
        this.subdiv = record.get(4);
        this.salary = Integer.parseInt(record.get(5));
    }

    /** 
     * @param line line in incorrect form
     * @param record fixed line in needed form
     */
    private void fixInvalidRecord(String[] line, ArrayList<String> record) 
    {
        String[] piece = new String[0];
        String fullName = "";
        if (line.length == 2) 
        {
            piece = line[1].split(";");
            fullName = record.get(1) + piece[0];
        } 
        else if (line.length == 3)
        {
            var piece1 = line[1];
            piece = line[2].split(";");
            fullName = record.get(1) + piece1 + piece[0];
        }
        record.set(1, fullName);
        record.addAll(Arrays.asList(piece).subList(1, piece.length));
    }

    /** 
     * @return int one of the geters(ID)
     */
    public int getId() 
    {
        return id;
    }

    
    /** 
     * @param id one of the seters(ID)
     */
    public void setId(int id) 
    {
        this.id = id;
    }

    
    /** 
     * @return String one of the geters(NAME)
     */
    public String getName() 
    {
        return name;
    }
    
    
    /** 
     * @param name one of the seters(NAME)
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    
    /** 
     * @return String one of the geters(GENDER)
     */
    public String getSex() 
    {
        return sex;
    }
    
    
    /** 
     * @param sex one of the seters(SEX)
     */
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    
    /** 
     * @return String one of the geters(BIRTHDATE)
     */
    public String getBirthDate() 
    {
        return birthDate;
    }
    
    
    /** 
     * @param birthDate one of the seters(BIRTHDATE)
     */
    public void setBirthDate(String birthDate) 
    {
        this.birthDate = birthDate;
    }

    
    /** 
     * @return String one of the geters(DIVISION)
     */
    public String getSubdiv() 
    {
        return subdiv;
    }

    
    /** 
     * @param subdiv one of the seters(DIVISION)
     */
    public void setSubdiv(String subdiv) 
    {
        this.subdiv = subdiv;
    }

    
    /** 
     * @return int one of the geters(SALARY)
     */
    public int getSalary() 
    {
        return salary;
    }

    
    /** 
     * @param salary one of the seters(SALARY)
     */
    public void setSalary(int salary) 
    {
        this.salary = salary;
    }

    
    /** 
     * @param object obj to compare
     * @return boolean result of comparing
     */
    @Override
    public boolean equals(Object object) 
    {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person human = (Person) object;
        return id == human.id && salary == human.salary && name.equals(human.name) && sex.equals(human.sex) && birthDate.equals(human.birthDate) && subdiv.equals(human.subdiv);
    }

    
    /** 
     * @return int hash code of this obj
     */
    @Override
    public int hashCode() 
    {
        return Objects.hash(id, name, sex, birthDate, subdiv, salary);
    }

    
    /** 
     * @return String performance
     */
    @Override
    public String toString() 
    {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth date='" + birthDate + '\'' +
                ", subdiv='" + subdiv + '\'' +
                ", salary=" + salary +
                '}' + '\n';
    }

    
}
