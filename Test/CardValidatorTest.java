import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CardValidatorTest {

    private CardValidator cardValidator;

    @Before
    public void setUp() throws Exception {
        cardValidator = new CardValidator();
    }

    @Test
    public void shouldReturnFalseWhenGivenASingleDigitNumber() {
        /*GIVEN*/
        String inputCardNumber = "1";

        /*WHEN*/
        boolean expectedValue = cardValidator.validateLength(inputCardNumber);

        /*THEN*/
        assertThat(expectedValue, is(false));

    }

    @Test
    public void shouldReturnTrueWhenGiven15DigitNumber(){
        String inputCardNumber = "111112222211111";

        boolean expectedValue = cardValidator.validateLength(inputCardNumber);

        assertThat(expectedValue, is(true));

    }

    @Test
    public void shouldReturnFalseWhenGiven19DigitNumber(){
        String inputCardNumber = "1111122222111112222";

        boolean expectedValue = cardValidator.validateLength(inputCardNumber);

        assertThat(expectedValue, is(false));
    }

    @Test
    public void shouldReturnFalseWhenGivenAlphabeticalCharacter(){
        String inputCardNumber = "a";

        boolean expectedValue = cardValidator.stringContainsOnlyNumbers(inputCardNumber);

        assertThat(expectedValue, is(false));

    }

    @Test
    public void shouldReturnTrueWhenGivenA1(){
        String inputCardNumber = "1";

        boolean expectedValue = cardValidator.stringContainsOnlyNumbers(inputCardNumber);

        assertThat(expectedValue, is(true));

    }

    @Test
    public void shouldReturnTrueWhenGivenA2() {
        String inputCardNumber = "2";

        boolean expectedValue = cardValidator.stringContainsOnlyNumbers(inputCardNumber);

        assertThat(expectedValue, is(true));

    }

    @Test
    public void shouldReturnTrueWhenGivenATwoDigitNumber() {
        String inputCardNumber = "34";

        boolean expectedValue = cardValidator.stringContainsOnlyNumbers(inputCardNumber);

        assertThat(expectedValue, is(true));

    }

    @Test
    public void shouldReturnFalseWhenGivenSpecialCharacters(){
        String inputCardNumber = "!@#$%^&*()_+:{}|',.";

        boolean expectedValue = cardValidator.stringContainsOnlyNumbers(inputCardNumber);

        assertThat(expectedValue, is(false));

    }

    @Test
    public void shouldReturnFalseWhenGivenInvalidCreditCard() {
        String inputCardNumber = "lester";

        boolean expectedValue = cardValidator.cardValidator(inputCardNumber);

        assertThat(expectedValue, is(false));
    }

    @Test
    public void shouldReturnTrueWhenGivenValidCreditCard() {
        String inputCardNumber = "111112222211111";

        boolean expectedValue = cardValidator.cardValidator(inputCardNumber);

        assertThat(expectedValue, is(true));

    }

    @Test
    public void shouldReturnFalseWhenOneCardInListIsInvalid() {
        String[] creditCards = new String[5];

    }


}