/*
 * Copyright 2020 Precog Data
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package quasar.physical.blobstore
package azure

import quasar.connector.datasource.LightweightDatasourceModule
import quasar.physical.blobstore.BlobstoreDatasource._

import cats.effect.IO

abstract class AzureDatasourceSpec extends BlobstoreDatasourceSpec[IO] {

  val cfg: AzureConfig

  override def datasource: IO[LightweightDatasourceModule.DS[IO]] =
    AzureDatasource.mk[IO](cfg)
}
