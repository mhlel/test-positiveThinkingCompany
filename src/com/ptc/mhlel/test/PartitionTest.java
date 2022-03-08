package com.ptc.mhlel.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.ptc.mhlel.exercice.Partition;

/**
 * @author Mohamed hlel
 *
 */
public class PartitionTest {
	
	/**
	 * test génére une exception si la taille est négative
	 *
	 */
	@Test(expected = Exception.class)
	public void testGenerateExceptionIfTailleNegative() throws Exception {
		Partition.partition(Arrays.asList(1, 2, 3, 4, 5), -2);
	}

	/**
	 * test génére une exception si la taille est egale Zero
	 *
	 */
	@Test(expected = Exception.class)
	public void testGenerateExceptionIfTailleZero() throws Exception {
		Partition.partition(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 0);
	}
	
	/**
	 * test génére une exception si la liste est null
	 *
	 */

	@Test(expected = Exception.class)
	public void testGenerateExceptionIfListIsNull() throws Exception {
		Partition.partition(null, 3);
	}

	/**
	 * test retourne une partition vide si la liste est vide
	 *
	 */
	@Test
	public void testReturnEmptyListPartitionIfListIsNull() throws Exception {
		Collection<List<Integer>> listOfList = Partition.partition(Arrays.asList(), 3);
		Assert.assertEquals(listOfList, Arrays.asList());
	}

	/**
	 * test retourne une partition si la taille est positive et la liste n'ést pas null et n'est pas vide
	 *
	 */
	@Test
	public void testReturnPartitionIfTailleIsPositive() throws Exception {
		Collection<List<Integer>> listOfList = Partition.partition(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3);
		Assert.assertEquals(listOfList, Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9), Arrays.asList(10)));
	}

}