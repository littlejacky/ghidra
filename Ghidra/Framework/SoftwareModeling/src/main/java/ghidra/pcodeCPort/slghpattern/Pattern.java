/* ###
 * IP: GHIDRA
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
package ghidra.pcodeCPort.slghpattern;

import java.io.IOException;

import ghidra.program.model.pcode.Encoder;

public abstract class Pattern {

	public void dispose() {
	}

	public abstract Pattern simplifyClone();

	public abstract void shiftInstruction(int sa);

	public abstract Pattern doOr(Pattern b, int sa);

	public abstract Pattern doAnd(Pattern b, int sa);

	public abstract Pattern commonSubPattern(Pattern b, int sa);

	public abstract int numDisjoint();

	public abstract DisjointPattern getDisjoint(int i);

	public abstract boolean alwaysTrue();

	public abstract boolean alwaysFalse();

	public abstract boolean alwaysInstructionTrue();

	public abstract void encode(Encoder encoder) throws IOException;

}
