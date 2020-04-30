

import java.util.*;

public class genericsum
{
    Scanner sc =new Scanner(System.in);

    private class Node
    {
        int data;
        ArrayList<Node> ch=new ArrayList<>();

    }

    private Node root;

    public genericsum()
    {
        this.root  =construct(null,-1);

    }

    private Node construct(Node p,int it)
    {
        int it-sc.nextInt();
        Node nn = new Node();
        nn.data=it;
        int noc=sc.nextInt();
        for(int i = 0;i<noc;i++)
        {
            Node child = construct(nn, i);
            nn.ch.add(child);
        }
        
        return nn;
    }
    
	public int size() {
		return size(this.root);
	}

	private int size(Node node) {

		int ts = 0;

		for (Node child : node.ch) {
			int cs = size(child);
			ts += cs;
		}

		return ts + 1;

	}
}