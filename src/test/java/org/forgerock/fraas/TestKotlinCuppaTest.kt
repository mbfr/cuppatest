package org.forgerock.fraas

import org.assertj.core.api.Assertions.assertThat
import org.forgerock.cuppa.Cuppa.*
import org.forgerock.cuppa.Test
import org.forgerock.cuppa.junit.CuppaRunner
import org.junit.runner.RunWith
import java.util.*

@Test
@RunWith(CuppaRunner::class)
class TestKotlinCuppaTest {
    init {
        describe("jfjf") {
            `when`("I do a thing") {
                val list: List<String> = ArrayList()

                it("has a length of 0") {
                    assertThat(list.size).isEqualTo(0)
                }
                it("has a length of 1") {
                    assertThat(list.size).isEqualTo(1)
                }
            }
        }
    }
}
