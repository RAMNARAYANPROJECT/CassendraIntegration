
import scala.collection.mutable.ArrayStack
import org.junit.Assert
import org.junit.Test

class TestJunit {
  @Test def testFun{
    var arr = new ArrayStack[Int];
    Assert.assertTrue(arr.isEmpty)
    
    
  }
}