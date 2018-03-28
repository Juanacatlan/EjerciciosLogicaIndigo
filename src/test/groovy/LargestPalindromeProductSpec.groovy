import spock.lang.Specification
import spock.lang.Unroll

class LargestPalindromeProductSpec extends Specification {
    @Unroll('Tests that find the largest palíndrome product of two numbers of three digits')
    def 'The result product is equals to the expected'() {
        given: 'An instance of the class'
        LargestPalindromeProduct lpp = new LargestPalindromeProduct()
        and: 'A limit number between 101101 and 999999'
        int n = _n
        when: 'Compare the number obtained and the expected'
        int largestPalindrome = lpp.obtainLargestPalindome(n)
        then: 'The number must be the #_expected'
        largestPalindrome == _expected
        where:
        _n | _expected
        101110 | 101101
        800000 | 793397
        999999 | 906609
    }
}