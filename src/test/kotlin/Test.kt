
import org.hamcrest.core.StringContains
import org.jonnyzzz.teamcity.dsl_generated.Build_Jonnyzzz_Test
import org.junit.Assert
import org.junit.Test

/**
 * Created by eugene.petrenko@gmail.com
 */

class DSLTest {

  @Test
  fun testSomeDSLProperty() {
    println(Build_Jonnyzzz_Test.id.id)

    Assert.assertThat(Build_Jonnyzzz_Test.id.id, StringContains("Jonnyzzz"))
  }
}
