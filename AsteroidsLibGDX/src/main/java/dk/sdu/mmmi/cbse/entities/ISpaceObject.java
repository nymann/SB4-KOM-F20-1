package dk.sdu.mmmi.cbse.entities;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public interface ISpaceObject {
  public void draw(ShapeRenderer sr);

  public void update(float dt);
}
