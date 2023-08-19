package Repository;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import Context.IWriteDbContext;
import Fourteam.db.DbSet;
import Model.Tripulante.Cargo;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CargoRepository_Test {

	IWriteDbContext _database = Mockito.mock(IWriteDbContext.class);
	DbSet<Cargo> _cargos = Mockito.mock(DbSet.class);

	@Before
	public void setUp() {
		_database.Cargo = _cargos;
	}

	@Test
	public void constructor_accept() {
		CargoRepository repository = new CargoRepository(_database);
		Assert.assertNotNull(repository);
	}

	@Test
	public void FindByKey_accept() throws Exception {
		Cargo a = new Cargo();
		when(_cargos.Single(any())).thenReturn(a);
		CargoRepository repository = new CargoRepository(_database);
		repository.FindByKey(UUID.randomUUID());
		Assert.assertNotNull(repository);
	}

	@Test
	public void GetAll_accept() throws Exception {
		CargoRepository repository = new CargoRepository(_database);
		repository.GetAll();
		Assert.assertNotNull(repository);
	}

	@Test
	public void Create_accept() throws Exception {
		CargoRepository repository = new CargoRepository(_database);
		repository.Create(new Cargo());
		Assert.assertNotNull(repository);
	}

	@Test
	public void Delete_accept() throws Exception {
		CargoRepository repository = new CargoRepository(_database);
		repository.Delete(new Cargo());
		Assert.assertNotNull(repository);
	}

	@Test
	public void Update_accept() throws Exception {
		CargoRepository repository = new CargoRepository(_database);
		repository.Update(new Cargo());
		Assert.assertNotNull(repository);
	}
}
