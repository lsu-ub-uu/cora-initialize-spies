/**
 * The testspies module provides common spies used when testing Cora projects.
 */
module se.uu.ub.cora.initialize.spies {

	requires org.testng;
	requires transitive se.uu.ub.cora.initialize;
	requires transitive se.uu.ub.cora.testutils;

	exports se.uu.ub.cora.initialize.spies;
}