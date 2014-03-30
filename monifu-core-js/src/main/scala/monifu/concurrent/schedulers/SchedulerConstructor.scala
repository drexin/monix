package monifu.concurrent.schedulers

import monifu.concurrent.Scheduler

private[concurrent] trait SchedulerConstructor {
  object Implicits {
    implicit lazy val global: Scheduler =
      JSAsyncScheduler
  }

  def async: Scheduler =
    JSAsyncScheduler
}