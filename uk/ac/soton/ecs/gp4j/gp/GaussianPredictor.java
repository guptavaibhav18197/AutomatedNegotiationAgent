package uk.ac.soton.ecs.gp4j.gp;

import Jama.Matrix;

public interface GaussianPredictor<T extends GaussianPrediction> {
	Matrix getTrainX();

	Matrix getTrainY();

	T calculatePrediction(Matrix testX);
}
