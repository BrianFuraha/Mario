package jade;

import org.joml.Vector2f;

public abstract class Scene {

    protected  Camera camera;

    public Scene() {

    }

    public void init() {

    }

    public abstract void update(float dt);
}
