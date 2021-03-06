package NaturalNumbers

/**
 * Created by alex on 24/08/14.
 */
abstract class Nat {

  def isZero: Boolean

  def predecessor: Nat

  def successor: Nat = new Succ(this)

  def +(that: Nat): Nat

  def -(that: Nat): Nat
}

