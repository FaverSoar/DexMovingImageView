/*
 * Copyright 2014 Diego Grancini
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

package it.dex.movingimageviewlib.evaluating;

import android.view.View;

import it.dex.movingimageviewlib.evaluating.evaluators.AutoEvaluator;
import it.dex.movingimageviewlib.evaluating.evaluators.GyroscopeEvaluator;
import it.dex.movingimageviewlib.evaluating.evaluators.ScrollEvaluator;

/**
 * Created by Diego on 08/12/2014.
 */
public class EvaluatorChooser {

    public static Evaluator get(EVALUATORS coordinator, View view) throws IllegalArgumentException {
        switch (coordinator) {
            case SCROLL:
                return new ScrollEvaluator(view);
            case TIME:
                return new AutoEvaluator(view);
            case GYROSCOPE:
                return new GyroscopeEvaluator(view);
            default:
                throw new IllegalArgumentException();
        }
    }
}