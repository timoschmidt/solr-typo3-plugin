/**
 * Copyright 2010-2011 Ingo Renner <ingo@typo3.org>
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

package org.typo3.access;

/**
 * Enum to differentiate between page, content, and record access checking.
 *
 * @author Ingo Renner <ingo@typo3.org>
 */
public enum RootlineElementType {

  /**
   * Page Access Rootline element.
   */
  PAGE,

  /**
   * Content Access Rootline element.
   */
  CONTENT,

  /**
   * Record Access Rootline element.
   */
  RECORD
}
