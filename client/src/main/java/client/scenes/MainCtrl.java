/*
 * Copyright 2021 Delft University of Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package client.scenes;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.awt.*;

public class MainCtrl {

    private Stage primaryStage;

    //private QuoteOverviewCtrl overviewCtrl;
    //private Scene overview;

    //private AddQuoteCtrl addCtrl;
    //private Scene add;

    private SplashCtrl splashCtrl;
    private Scene opening;

    private SingleCtrl singleCtrl;
    private Scene singleplayer;

    private MultiChoiceQCtrl multiCtrl;
    private Scene multiChoice;

    private MoreEnergyQCtrl moreECtrl;
    private Scene moreEnergy;

    private OpenQCtrl openQCtrl;
    private Scene openQ;

    private NameSelectCtrl nameSelectCtrl;
    private Scene nameSelect;

    /*
    public void initialize(Stage primaryStage, Pair<QuoteOverviewCtrl, Parent> overview,
            Pair<AddQuoteCtrl, Parent> add) {
        this.primaryStage = primaryStage;
        this.overviewCtrl = overview.getKey();
        this.overview = new Scene(overview.getValue());

        this.addCtrl = add.getKey();
        this.add = new Scene(add.getValue());

        showOverview();
        primaryStage.show();
    }
    */

    public void initializeNew(Stage primaryStage, Pair<SplashCtrl, Parent> opening,
                              Pair<SingleCtrl, Parent> singleplayer,
                              Pair<MultiChoiceQCtrl, Parent> multiChoice,
                              Pair<NameSelectCtrl, Parent> nameSelect) {
        this.primaryStage = primaryStage;
        this.splashCtrl = opening.getKey();
        this.opening = new Scene(opening.getValue());
        this.singleplayer = new Scene(singleplayer.getValue());
        this.multiChoice = new Scene(multiChoice.getValue(), Color.web("#011826"));
        this.nameSelect = new Scene(nameSelect.getValue(),Color.web("#011826"));
        this.nameSelectCtrl = nameSelect.getKey();
        showSplash();
        primaryStage.show();
    }

    public void showSplash() {
        primaryStage.setTitle("Quizzzz!");
        primaryStage.setScene(opening);
        primaryStage.setMinHeight(900);
        primaryStage.setMinWidth(1440);
    }

    public void showSingle() {
        primaryStage.setTitle("Singleplayer Mode");
        primaryStage.setScene(singleplayer);
    }

    public void showMultiChoiceQ() {
        int i = 0;  //temp variable for question count
        primaryStage.setTitle("Question " + i);
        primaryStage.setScene(multiChoice);
    }

    public void showMoreEnergyQ(Pair<MoreEnergyQCtrl, Parent> moreEnergyPair) {
        this.moreEnergy = new Scene(moreEnergyPair.getValue(), Color.web("#011826"));
        primaryStage.setTitle("Question");
        primaryStage.setScene(moreEnergy);
    }

    public void showOpenQ(Pair<OpenQCtrl, Parent> openQPair) {
        this.openQ = new Scene(openQPair.getValue(), Color.web("#011826"));
        primaryStage.setTitle("Question");
        primaryStage.setScene(openQ);
    }

    public void showNameSelect() {
        primaryStage.setTitle("Name Screen");
        primaryStage.setScene(nameSelect);
    }

    /*
    public void showOverview() {
        primaryStage.setTitle("Quotes: Overview");
        primaryStage.setScene(overview);
        overviewCtrl.refresh();
    }

    public void showAdd() {
        primaryStage.setTitle("Quotes: Adding Quote");
        primaryStage.setScene(add);
        add.setOnKeyPressed(e -> addCtrl.keyPressed(e));
    }
    */
}