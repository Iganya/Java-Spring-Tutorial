package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;


public class NumberGeneratorImpl implements NumberGenerator{

    private static final Logger log = LoggerFactory.getLogger(NumberGeneratorImpl.class);
    //== fields ==
    private final Random random = new Random();

    @Autowired
    @MaxNumber
    private int maxNumber;

    @Autowired
    @MinNumber
    private int minNumber;

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
