package storm.scala.dsl

import backtype.storm.tuple.Tuple

/**
 *
 */
trait ProcessFunc {
  // registered setup functions
  private var processFuncs: List[(Tuple) => Unit] = Nil

  // fire all setup functions
  def _process(tuple : Tuple) = processFuncs.foreach(_(tuple))

  // register a setup function
  def process(func: (Tuple) => Unit) = { processFuncs ::= func }
}
