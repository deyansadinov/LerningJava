package com.clouway.objectsinjava;

//Eлементите на дървото имат едни и същи дървовидни свойства.
//        Да се направи така, че да могат да се добавят различни типове елементи (Cat, Dog, Person, Integer, Double и т.н.)
//        Упътване : Към дървото трябва да могат да се добавят възли(nodes), които да бъдат инстанции на различни класове.

public class HeterogeneousTree {
    private class Node {

        Comparable<Object> valueObject;

        Node leftChild;
        Node rightChild;

        private Node(Comparable object) {
            this.valueObject = object;
        }

        @Override
        public String toString() {
            return "Node {" +
                    "valueObject=" + valueObject +
                    '}';
        }

        private void add(Node parent, Comparable<Object> object) {
            if(valueObject.compareTo(object) == 0){
                return;
            }
            if (valueObject.compareTo(object) > 0) {
                if (leftChild == null) {
                    leftChild = new Node(object);
                } else {
                    leftChild.add(leftChild, object);
                }
                return;
            }
            if (valueObject.compareTo(object) < 0) {
                if (rightChild == null) {
                    rightChild = new Node(object);
                } else {
                    rightChild.add(rightChild, object);
                }
                return;
            }
        }
    }


    private Node root;

    private void inOrderTraverse(Node searchNode) {

        if (searchNode != null) {

            System.out.println(searchNode);

            inOrderTraverse(searchNode.leftChild);

            inOrderTraverse(searchNode.rightChild);

        }
    }

    public void addObject(Comparable<Object> object) {

        Comparable<Object> newValue = object;
        // tree is empty?
        if (root == null) {

            root = new Node(object);

            return;
        }

        root.add(root, object);

    }

    public void inOrderTraverse() {
        inOrderTraverse(root);
    }

    public Object search(Comparable searchObj) {

        Node focusNode = root;

        while (focusNode != null) {

            if (focusNode.valueObject.compareTo(searchObj) == 0) {
                return focusNode;
            }

            if (focusNode.valueObject.compareTo(searchObj) < 0) {

                focusNode = focusNode.rightChild;

            } else if (focusNode.valueObject.compareTo(searchObj) > 0) {

                focusNode = focusNode.leftChild;

            }

        }

        return null;

    }


}