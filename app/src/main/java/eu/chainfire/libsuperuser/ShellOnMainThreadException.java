/*
 * Copyright (C) 2012-2015 Jorrit "Chainfire" Jongma
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.chainfire.libsuperuser;

/**
 * Exception class used to crash application when shell commands are executed
 * from the main thread, and we are in debug mode.
 */
class ShellOnMainThreadException extends RuntimeException {
    static final String EXCEPTION_COMMAND = "Application attempted to run a shell command from the main thread";

    ShellOnMainThreadException() {
        super(ShellOnMainThreadException.EXCEPTION_COMMAND);
    }
}
