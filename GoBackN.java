import java.lang.*;
import java.util.*;
class GoBackN
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nImplementing Sliding Window Protocol using GoBackN apporach\n");
		System.out.println("\nEnter the Max.Window Size:\n");
		int n = sc.nextInt();
		int frame = (int)Math.pow(2,n);
		int transmit[] = new int[frame];
		int transmit_flag[] = new int[frame];
		int receive[] = new int[frame-1];
		int index=0;						//To keep track of Window
		int count1=0;
		int count2=0;
		for(int c=0;c<n;c++)
		{
			transmit[c] = c;
			transmit_flag[c] = 0;			//Indication of the bit to be sent
		}
		int inp = 1;
		do
		{
			System.out.println("\n1.Execute  2.Exit\n");
			inp = sc.nextInt();
			switch(inp)
			{
				case 1:
				{
					count1 = 0;
					count2 = 0;
					System.out.println("\nFrame Allowed:\n");
					for(int c=index;c<n;c++)
					{
						if( count1!=n-1 )
						{
							System.out.print(transmit[c]+" ");
							count1+=1;
						}
					}
					if( count1 != n-1 )
					{
						for(int d=0,l=1;l<=n-count1;d++,l++)
						{
							System.out.print(transmit[d]+" ");
							count1+=1;
						}
					}
					System.out.println();
					System.out.println("\nEnter the Transmitting Frame\n");
					for(int c=0;c<n-1;c++)
					{
						receive[c] = sc.nextInt();
					}
					System.out.println("\nMax. Window Size Reached\n"+index+"\n");
					for(int c=0;c<n-1;c++)
					{
						if ( receive[c] == transmit[index] )
						{
							transmit_flag[index] = 1;
							System.out.println(receive[c]+" is acknowledged\n");
							if( index == n-1 )
							{
								index=0;
							}
							else
							{
								index+=1;
							}

						}
						else
						{
							System.out.println(receive[c]+" is not acknowledged");
							break; 
						}
					}
					for(int c=index;c<n;c++)
					{
						transmit_flag[c] = 0;
						count2+=1;
					}
					if( count2 != n )
					{
						for(int d=0,l=1;l<=n-count2;l++,d++)
						{
							transmit_flag[d] = 0;
						}
					}
					break;
				}
				case 2:
				{
					System.out.println("\nExit!!\n");
					break;
				}
				default:
				{
					System.out.println("\nInvalid input\n");
					break;
				}
			}
		}while(inp!=2);}}


OP:
Enter the Max.Window Size:

8

1.Execute  2.Exit

1

Frame Allowed:

0 1 2 3 4 5 6

Enter the Transmitting Frame

0
1
2
3
4
5
6

Max. Window Size Reached
0

0 is acknowledged

1 is acknowledged

2 is acknowledged

3 is acknowledged

4 is acknowledged

5 is acknowledged

6 is acknowledged
