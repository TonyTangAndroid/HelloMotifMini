package motif.inject;

import motif.Creatable;
import motif.NoDependencies;

@motif.Scope
interface InjectScope extends Creatable<NoDependencies> {

  Context context();

  @motif.Objects
  abstract class Objects {

    abstract Context context();
  }
}
