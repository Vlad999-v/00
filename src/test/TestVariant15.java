package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant15;

public class TestVariant15 {

////////////////////////////////////////////////////
    @DataProvider(name = "data-provider-integer")
    public Object[][] integerProvider() {

        return new Object[][] { { 213,123 }, { 345,435 } };
    }

    @Test(dataProvider = "data-provider-integer")
    public void integerTest(int x, int result) {
        assertEquals(new Variant15().integerTask(x),result);
    }
/////////////////////////////////////////////////////
    @DataProvider(name = "data-provider-boolean")
    public Object[][] booleanProvider()
    {
    return new Object[][] { { 1,2,-9,true }, { 0,3,-9,false } };
    }

    @Test(dataProvider = "data-provider-boolean")
    public void booleanTest(int a,int b,int c, boolean result) {
        assertEquals(new Variant15().booleanTask(a,b,c),result);
    }
////////////////////////////////////////////////////////
    @DataProvider(name = "data-provider-if")
    public Object[][] ifProvider() {

        return new Object[][] { { 1,2,-9,3 }, { 5,3,-9,8 }, {5,5,5,10} };
    }

    @Test(dataProvider = "data-provider-if")
    public void ifTest(int a,int b,int c, int result) {

        assertEquals(new Variant15().ifTask(a,b,c),result);
    }

/////////////////////////////////////////////////////
    @DataProvider(name = "data-provider-case")
    public Object[][] caseProvider() {
        return new Object[][] { {9, 2, "Nine Diamond"}, {11, 3, "Jack Club"} };
        ///return new Object[][] { { 9,2,1}, { 11,3,1}}; }
    }

    @Test(dataProvider = "data-provider-case")
    public void ifTest(int n,int m, String result) {
        assertEquals(new Variant15().caseTask(n,m),result);
    }
/////////////////////////////////////////////////////
    @DataProvider(name = "data-provider-while")
    public Object[][] whileProvider() {

    return new Object[][] {
            { 10, new Variant15.SpecialWhileTask(1,1100)},
            { 5, new Variant15.SpecialWhileTask(2,1102.5) } };
    }

    @Test(dataProvider = "data-provider-while")
    public void whileTest(double p, Variant15.SpecialWhileTask result) {
        assertEquals(new Variant15().whileTask(p).a,result.a);
        assertEquals(new Variant15().whileTask(p).b,result.b);

    }

//////////////////////////////////////////////////////
    @DataProvider(name = "data-provider-minmax")
    public Object[][] minmaxProvider() {

    return new Object[][] {
            { 2.1,5.7, new double[]  { 2.0, 2.5, 3.6,4.0,5.0,6.7,8,9,0,10}, new double[]  {5,4}},
            { 2.1,5.7, new double[]  { 2.0, 2.5, 3.6,4.0,5.8,6.7,8,9,0,10}, new double[]  {4,3} }};

    }

    @Test(dataProvider = "data-provider-minmax")
    public void minmaxTest(double b, double c, double [] array ,double [] result) {
        assertEquals(new Variant15().minmaxTask(b,c,array),result);
    }
/////////////////////////////////////////////////////////
@DataProvider(name = "data-provider-array")
public Object[][] arrayProvider() {

    return new Object[][] {
            { new double[]  { 0,1,2,3,4,5,6},new double[]  {1,3,5,6,4,2}}
            };
    }

    @Test(dataProvider = "data-provider-array")
    public void arrayTest(double [] array ,double [] result) {

        assertEquals(new Variant15().arrayTask(array),result);
    }
///////////////////////////////////////////////////////////
@DataProvider(name = "data-provider-matrix")
public Object[][] matrixProvider() {

    double[][] input = {
            {0, 1, 2, 3, 4},
            {5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19},
            {20, 21, 22, 23, 24}

    };

    double[][] output = {
            {0, 1, 2, 3, 4},
            {9, 14, 19, 24, 23},
            {22, 21, 20, 15, 10},
            {5, 6, 7, 8, 13},
            {18, 17, 16, 11, 12}
    };

    return new Object[][] {{input, output}};
}
    @Test(dataProvider = "data-provider-matrix")
    public void matrixTest(double [][] array, double [][] result) {
        ///assertEquals(new Variant15().matrixTask(array),result);
        ///assertarrayEquals(new Variant15().matrixTask(array),result);
        ///assertArrayEquals(new Laboratory1().matrixAction(M,N,D,arrayM), output);
        double[][] expected = new Variant15().matrixTask(array);
        for(int i=0;i<result.length;i++){
            assertEquals(expected[i],result[i]);
        }
    }
///////////////////////////////////////////////////////////
@DataProvider(name = "data-provider-for")
public Object[][] forProvider()
{
    return new Object[][] { { 2.2,2,4.840000000000001 }, { 5,5,3125} };
}

    @Test(dataProvider = "data-provider-for")
    public void forTest( double a, int n, double result) {
        assertEquals(new Variant15().forTask(a,n),result);
    }
/////////////////////////////////////////////////////////////
}