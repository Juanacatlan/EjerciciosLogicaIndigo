import spock.lang.Specification
import spock.lang.Unroll
import sun.util.resources.cldr.naq.CalendarData_naq_NA

class LargestProductInASeriesTest extends Specification {

    @Unroll('the series of 5 digits in a number that has the largest product')
    def 'the result product is equals to the number expected'() {
        given: 'An instace of the class'
          LargestProductInASeries lpp = new LargestProductInASeries()
        and: 'the number of test cases, a number of n digits, a size of the series and the number'
          int n = _n
          int k = _k
          String num = _num
        when: 'compare the product obtained and the expected'
          int largestProduct = lpp.calculateProduct(n, k, num)
        then: 'The result must be the expected'
          largestProduct == _expected
        where:
          _n | _k | _num |  _expected
          10 | 5 | '3675356291' | 3150
          10 | 5 | '2709360626' | 0
    }
}

