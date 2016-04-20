package exercise4;


import static org.junit.Assert.*;
import org.junit.Test;

public class GradeTest {

  @Test
  public void score90isGradeA() {
    
    Grade grade = new Grade(90);

    assertEquals("A",grade.getGrade());

  }

  @Test
  public void score89isGradeB() {
    
    Grade grade = new Grade(89);

    assertEquals("B",grade.getGrade());

  }

  @Test
  public void score91isGradeB() {
    
    Grade grade = new Grade(91);

    assertEquals("A",grade.getGrade());

  }
  
  @Test
  public void score79isGradeC() {
    
    Grade grade = new Grade(79);

    assertEquals("C",grade.getGrade());

  }

  @Test
  public void score80isGradeB() {
    
    Grade grade = new Grade(80);

    assertEquals("B",grade.getGrade());

  }

  @Test
  public void score69isGradeD() {
    
    Grade grade = new Grade(69);

    assertEquals("D",grade.getGrade());

  }

  @Test
  public void score70isGradeC() {
    
    Grade grade = new Grade(70);

    assertEquals("C",grade.getGrade());

  }
  
  @Test
  public void score59isGradeF() {
    
    Grade grade = new Grade(59);

    assertEquals("F",grade.getGrade());

  }

  @Test
  public void score60isGradeD() {
    
    Grade grade = new Grade(60);

    assertEquals("D",grade.getGrade());

  }


}















