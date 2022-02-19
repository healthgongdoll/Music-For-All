
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sign
 */
@WebServlet("/Sign/*")
public class Sign extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sign() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Writer resOut = response.getWriter();

		/*
		 * Alphabet Image Array
		 */
		String[] alpha = new String[26];
		int counter = 64;
		for (int i = 0; i < alpha.length; i++) {
			counter = counter + 1;
			char letter = (char) counter;
			alpha[i] = "<img src=" + "\"images/" + String.valueOf(letter) + ".png\">" + "</img>"; //
			System.out.println(alpha[i]);
		}
		/*
		 * Lyrics reading
		 */

		/*
		 * Ajax call
		 */
		if (request.getPathInfo() != null && request.getPathInfo().equals("/Ajax")) {
			String file = "lyrics/lyrics.txt";
			InputStream istream = getServletContext().getResourceAsStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(istream));

			String str = reader.readLine();
			response.getWriter().append("<h1 id=\"lyricsheader\">");
			response.getWriter().append("Sign Language Lyrics");
			response.getWriter().append("</h1>");
			response.getWriter().append("<br />");
			while (str != null) {
				str = str.toUpperCase();
				str = str.replaceAll(" ", "");

				for (int i = 0; i < str.length(); i++) {
					int alphaNum = str.charAt(i);
					System.out.println(alphaNum);
					System.out.println((char) alphaNum);
					response.getWriter().append(alpha[alphaNum - 65]);
				}
				response.getWriter().append("<br />");
				System.out.println(str);
				str = reader.readLine();
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
