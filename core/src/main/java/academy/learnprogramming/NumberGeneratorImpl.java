package academy.learnprogramming;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Random;


@Slf4j
@Component
public class NumberGeneratorImpl implements NumberGenerator{
    //== fields ==
    private final Random random = new Random();

    @Getter
    private final int maxNumber;

    @Getter
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


}
