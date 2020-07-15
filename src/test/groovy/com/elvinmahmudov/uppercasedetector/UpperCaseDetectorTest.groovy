package com.elvinmahmudov.uppercasedetector

import spock.lang.Specification
import spock.lang.Unroll

class UpperCaseDetectorTest extends Specification {

    @Unroll
    def "check"() {
        when:
        def actualResult = UpperCaseDetector.check(input)

        then:
        expectedResult == actualResult

        where:
        input            | expectedResult
        ["Test"]         | true
        ["test"]         | false
        ["test", "Test"] | false
        ["Test", "Test"] | true
    }
}
