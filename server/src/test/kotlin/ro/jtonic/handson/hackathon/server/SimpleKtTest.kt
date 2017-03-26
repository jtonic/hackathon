package ro.jtonic.handson.hackathon.server

import io.kotlintest.specs.StringSpec

/**
 * Created by Antonel Ernest Pazargic on 26/03/2017.
 * @author Antonel Ernest Pazargic
 */

class SimpleKtTest: StringSpec() {

    init {
        "string.length should return the size of the string" {
            "hello".length shouldBe 5
        }
    }
}