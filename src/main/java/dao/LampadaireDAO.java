package dao;

import javax.inject.Singleton;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import entities.Lampadaire;

@Singleton
public class LampadaireDao {

	private static LampadaireDao lampadaireDao;


	private static final List<Lampadaire> lampadaires = Stream.of(
		new Lampadaire(0, false, [1.0, 0.0]),
		new Lampadaire(1, false, [0.0, 1.0]), 
        new Lampadaire(2, false, [1.0, 1.0]), 
        new Lampadaire(3, false, [0.0, 0.0])
	).collect(Collectors.toList());


	public Lampadaire get(int id) {
		return lampadaires.stream().filter(lampadaire -> lampadaire.getId() == id).findAny().orElse(null);
	}

	public Lampadaire getByCoordinate(double[] coordinates) {
		return Lampadaire.stream().filter(lampadaire -> lampadaire.getCoordinate().equals(coordinates)).findAny().orElse(null);
	}

	public List<Lampadaire> getAll() {
		return Collections.unmodifiableList(lampadaires);
	}

	public void create(Lampadaire entity) {
		lampadaires.add(entity);
	}

	public void delete(Lampadaire entity) {
		lampadaires.remove((int) entity.getId());
	}

}