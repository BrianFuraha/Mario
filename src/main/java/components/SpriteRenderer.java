package components;

import jade.Component;

public class SpriteRenderer extends Component {

    private boolean firstTime = false;

    @Override
    public void start() {
        System.out.println("i am starting");
    }
    @Override
    public void update(float dt) {
        if (!firstTime) {
            System.out.println("i am updating");
            firstTime = true;
        }
    }
}
