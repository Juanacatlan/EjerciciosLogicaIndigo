import spock.lang.Specification
import spock.lang.Unroll

class LargestProductInASeriesTest extends Specification {
    @Unroll('The series of #_k digits in a number #_n that has the largest product')
    def 'the result product is equals to the #_expected'() {
        given: 'An instace of the class'
          LargestProductInASeries lps = new LargestProductInASeries()
        and: 'the number of test cases, a number of n digits, a size of the series and the number'
          int n = _n
          int k = _k
          String num = _num
        when: 'Compare the product obtained and the expected'
          int largestProduct = lps.calculateProduct(n, k, num)
        then: 'The result must be the expected'
          largestProduct == _expected
        where:
          _n | _k | _num |  _expected
          10 | 5 | '3675356291' | 3150
          10 | 5 | '2709360626' | 0
    }
}

