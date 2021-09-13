package implementacion;


public interface IStoreBuilder<T extends GenericEntity> {
  Store<T>createStore();
}
