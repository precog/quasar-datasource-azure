/*
 * Copyright 2014–2019 SlamData Inc.
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

package quasar.physical.blobstore.azure

import slamdata.Predef.Option
import quasar.blobstore.azure._
import quasar.connector.DataFormat

final case class AzureConfig(
    override val containerName: ContainerName,
    override val credentials: Option[AzureCredentials],
    override val storageUrl: StorageUrl,
    override val maxQueueSize: Option[MaxQueueSize],
    format: DataFormat) extends Config
