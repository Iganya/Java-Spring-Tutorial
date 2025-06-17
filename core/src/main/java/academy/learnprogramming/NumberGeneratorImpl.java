package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class NumberGeneratorImpl implements NumberGenerator{

    private static final Logger log = LoggerFactory.getLogger(NumberGeneratorImpl.class);
    //== fields ==
    private final Random random = new Random();

    private final int maxNumber;

    private final int minNumber;

    // == constructors ==
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber){
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }
    // == Public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        log.info("The max number is", maxNumber);
        return maxNumber;
    }

    @Override
    public int getMinNumber() {
        log.info("The min number is", minNumber);
        return minNumber;
    }
}
